# Epsilon

A Multiplatform library for uploading files

![Kotlin](https://img.shields.io/badge/kotlin-multiplatform-blue?style=for-the-badge&logo=kotlin&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=&logoColor=white)
![Swift](https://img.shields.io/badge/swift-F54A2A?style=for-the-badge&logo=swift&logoColor=white)
![iOS](https://img.shields.io/badge/iOS-000000?style=for-the-badge&logo=ios&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white)

## Setup: Gradle

```kotlin
dependencies {
    // if you need it in common code
    implementation("tz.co.asoft:epsilon-core:3.0.0")

    // if you want to upload real files
    implementation("tz.co.asoft:epsilon-file-core:3.0.0")
    
    // if you want to upload real files in a headless environment
    implementation("tz.co.asoft:epsilon-file-fields:3.0.0")
    
    // if you want to upload fake files
    implementation("tz.co.asoft:epsilon-fake:3.0.0")
    
    // if you want to to upload files from other networks
    implementation("tz.co.asoft:epsilon-network:3.0.0")
}
```

## Api Reference
The full api reference of kevlar can be found at [https://asoft-ltd.github.io/epsilon](https://asoft-ltd.github.io/epsilon)

## Support

There are multiple ways you can support this project

### Star It

If you found it useful, just give it a star

### Contribute

You can help by submitting pull request to available open tickets on the issues section

### Report Issues

This makes it easier to catch bugs and offer enhancements required

## Credits

- [andylamax](https://github.com/andylamax) - The author