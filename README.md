## Rain

Rain is an experimental, unnoficial fork of the [Telegram](https://telegram)
client for Android. The project's only objective is to add or modify existing
application features for the purposes of fun and learning.

### Maintainers

- Rodrigo Laneth ([@rlaneth](https://github.com/rlaneth))

## Building

1. Use Android Studio with
[NDK r16b](https://developer.android.com/ndk/downloads/older_releases). Newer
NDK versions are not yet supported.
2. Clone this repository. Use the `--recurse-submodules`
[command line flag](https://git-scm.com/docs/git-clone) with git in order to
include submodules.
3. Modify the **BuildVars.java** file (located on
_TMessagesProj/src/main/java/org/telegram/messenger/BuildVars.java_).

    - Obtain your own `APP_ID` and `APP_HASH` from Telegram at
    [https://core.telegram.org/api/obtaining_api_id]().
    - Obtain your own `HOCKEY_APP_HASH` and `HOCKEY_APP_HASH_DEBUG` from
    HockeyApp. [https://hockeyapp.net/]()
    
4. Generate a [google-services.json](https://developers.google.com/android/guides/google-services-plugin)
file from the [Firebase](http://firebase.google.com) console and add it to the
project.
5. Create a keystore containing a key to sign the application. Place it on
_TMessagesProj/config/release.keystore_ and add the required information to the
_gradle.properties_ file located on the root of the project.

## Documentation

### Requirements for unofficial Telegram clients

From the Telegram's official Android client
[repository](https://github.com/DrKLO/Telegram/blob/e222fded6cca5ace3649be6f18b55f526311bc79/README.md)
on GitHub.

1. Obtain an [app_id](https://core.telegram.org/api/obtaining_api_id) for the
application.
2. **Do not** use the name Telegram for the application, or make sure users
understand that it is unofficial.
3. **Do not** use Telegram's standard logo (white paper plane in a blue circle).
4. Study Telegram's
[security guidelines](https://core.telegram.org/mtproto/security_guidelines) and
take good care of user's data and privacy.
5. Publish the application's code in order to comply with the licenses.

### API and protocol

- [Telegram API documentation](https://core.telegram.org/api) (official)
- [MTProto documentation](https://core.telegram.org/mtproto) (official)

## Links

- [Forking Telegram for Android](https://radialle.com/criando-um-fork-do-telegram-para-android-5c3edaa1ed97)
  (Brazilian Portuguese)  
  A quick guide on building a Telegram fork from the official Android client
  repository.