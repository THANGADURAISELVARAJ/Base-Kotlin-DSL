object LibraryDeps {
    /**
     * Android Core Dependencies
     * */
    private const val KOTLIN_CORE_KTX = "androidx.core:core-ktx:${Versions.VERSION_CORE_KTX}"
    private const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.VERSION_APP_COMPAT}"
    private const val MATERIAL_DESIGN =
        "com.google.android.material:material:${Versions.VERSION_MATERIAL}"
    private const val CONSTRAIN_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.VERSION_CONSTRAIN_LAYOUT}"

    val LIST_OF_ANDROID_CORE_LIBRARIES = arrayListOf<String>().apply {
        add(KOTLIN_CORE_KTX)
        add(APP_COMPAT)
        add(MATERIAL_DESIGN)
        add(CONSTRAIN_LAYOUT)
    }
}


