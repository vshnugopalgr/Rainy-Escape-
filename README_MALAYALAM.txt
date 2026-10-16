RAINY ESCAPE - Android APK ഉണ്ടാക്കാനുള്ള പ്രോജക്ട്

ഈ ZIP ഒരു Android Studio project ആണ്. ഇത് നേരിട്ട് APK ഫയൽ അല്ല.

APK ഉണ്ടാക്കാൻ:
1. Windows/Mac/Linux കമ്പ്യൂട്ടറിൽ Android Studio ഇൻസ്റ്റാൾ ചെയ്യുക.
2. ഈ ZIP extract ചെയ്യുക.
3. Android Studio > Open > extract ചെയ്ത RainyEscape ഫോൾഡർ തിരഞ്ഞെടുക്കുക.
4. Gradle sync പൂർത്തിയാകാൻ കാത്തിരിക്കുക. ആദ്യ തവണ ഇന്റർനെറ്റ് ആവശ്യമായി വരാം.
5. Build > Build Bundle(s) / APK(s) > Build APK(s) തിരഞ്ഞെടുക്കുക.
6. build പൂർത്തിയായാൽ app/build/outputs/apk/debug/app-debug.apk ലഭിക്കും.
7. APK ഫോണിലേക്ക് മാറ്റി തുറക്കുക. ആവശ്യമെങ്കിൽ Settings-ൽ നിന്ന് ആ ഫയൽ മാനേജർ/ബ്രൗസറിന്
   "Install unknown apps" അനുമതി നൽകുക.

കുറിപ്പ്:
- Android SDK / Gradle ഇൻസ്റ്റാൾ ചെയ്ത കമ്പ്യൂട്ടർ ആവശ്യമാണ്.
- ഈ പ്രോജക്ടിൽ ഗെയിം HTML ഫയൽ ആപ്പിനുള്ളിൽ ഉൾപ്പെടുത്തിയിട്ടുണ്ട്; ഗെയിം പ്രവർത്തിക്കാൻ
  ഇന്റർനെറ്റ് അനിവാര്യമല്ല.
- ഇത് debug APK ആണ്, Play Store-ൽ പ്രസിദ്ധീകരിക്കാൻ signed release build വേണം.


ഫോൺ മാത്രം ഉപയോഗിച്ച് GitHub Actions വഴി APK ഉണ്ടാക്കാനുള്ള വഴി:
1. GitHub-ൽ ഒരു പുതിയ repository ഉണ്ടാക്കുക.
2. ZIP-നെ ഫോണിലെ file manager-ൽ extract செய்து, അതിലെ എല്ലാ ഫയലുകളും repository-ലേക്ക് upload ചെയ്യുക.
   .github/workflows/build-apk.yml എന്ന hidden folder/file upload ആയെന്ന് ഉറപ്പാക്കുക.
3. GitHub repository-യിലെ Actions tab തുറക്കുക.
4. "Build Rainy Escape APK" workflow തിരഞ്ഞെടുക്കുക.
5. "Run workflow" അമർത്തുക; build പൂർത്തിയാകുന്നത് വരെ കാത്തിരിക്കുക.
6. വിജയിച്ചാൽ workflow run പേജിലെ Artifacts വിഭാഗത്തിൽ "Rainy-Escape-APK" ഡൗൺലോഡ് ചെയ്യുക.
7. ZIP artifact extract ചെയ്ത് app-debug.apk ഇൻസ്റ്റാൾ ചെയ്യുക.

കുറിപ്പ്: GitHub account ആവശ്യമാണ്. GitHub Actions-ന്റെ free usage limits ബാധകമായേക്കാം.
Repository public ആക്കേണ്ടതില്ല; private repository ഉപയോഗിക്കാം. GitHub-ൽ secrets/passwords ഒന്നും ചേർക്കേണ്ടതില്ല.
