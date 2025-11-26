# Navigation Launcher - Spúšťač pre VocalizerEX a iGo Nextgen

## Čo táto aplikácia robí:
- Spustí VocalizerEX a hneď potom iGo Nextgen
- Označí sa ako navigačná aplikácia pre Android systém
- Vďaka tomu bude mať správne audio focus a bude stišovať hudbu

## Ako zostaviť APK:

### Metóda 1: Android Studio (odporúčané)
1. Nainštalujte Android Studio
2. Otvorte projekt z priečinka NavigationLauncher
3. Počkajte na synchronizáciu Gradle
4. Kliknite na Build → Build Bundle(s) / APK(s) → Build APK(s)
5. APK súbor nájdete v: `app/build/outputs/apk/debug/app-debug.apk`

### Metóda 2: Príkazový riadok (ak máte Gradle)
```bash
cd NavigationLauncher
./gradlew assembleDebug
```

## Ako nainštalovať:

1. Skopírujte APK súbor do vášho K706
2. Povoľte "Inštaláciu z neznámych zdrojov" v nastaveniach
3. Nainštalujte APK
4. Prejdite do: Nastavenia → Aplikácie → Predvolené aplikácie → Navigačná aplikácia
5. Vyberte "Nav Launcher"

## DÔLEŽITÉ - Zistenie správnych názvov balíkov:

Aplikácia obsahuje niekoľko možných názvov balíkov, ale možno budete musieť zistiť presný názov vašich aplikácií.

### Ako zistiť názov balíka:

1. Nainštalujte aplikáciu "Package Name Viewer" z Google Play
2. Nájdite VocalizerEX a iGo Nextgen
3. Poznačte si presné názvy balíkov

Alebo pomocou ADB:
```bash
adb shell pm list packages | grep -i igo
adb shell pm list packages | grep -i vocalizer
```

### Úprava názvov balíkov:

Ak aplikácia nenájde vaše aplikácie, upravte súbor:
`app/src/main/java/com/navlauncher/dual/LauncherActivity.java`

Riadky 33-37 (pre VocalizerEX):
```java
String[] possiblePackages = {
    "TU_VLOZ_SPRAVNY_NAZOV_BALIKA",
    "com.codefactory.vocalizerex",
    "com.vocalizer.ex"
};
```

Riadky 58-62 (pre iGo):
```java
String[] possiblePackages = {
    "TU_VLOZ_SPRAVNY_NAZOV_BALIKA",
    "com.nng.igo.primong.igoworld",
    "com.nng.igoprimoisr.javaclient"
};
```

Potom znova zostavte APK.

## Riešenie problémov:

**Aplikácia sa nespustí:**
- Skontrolujte, či máte správne názvy balíkov
- Pozrite si logy: `adb logcat | grep NavLauncher`

**Hudba sa stále nestišuje:**
- Uistite sa, že Nav Launcher je nastavený ako predvolená navigačná aplikácia
- Reštartujte zariadenie
- Skontrolujte nastavenia zvuku v iGo Nextgen

**Chcem zmeniť poradie spúšťania:**
- V súbore LauncherActivity.java zmeňte poradie volaní funkcií

## Licencia:
Voľné použitie na vlastné riziko.
