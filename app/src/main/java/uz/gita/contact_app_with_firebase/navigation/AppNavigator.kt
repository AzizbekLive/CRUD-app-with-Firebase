package uz.gita.contact_app_with_firebase.navigationimport cafe.adriel.voyager.androidx.AndroidScreentypealias Screen = AndroidScreeninterface AppNavigator {    suspend fun openWithSave(screen: Screen)    suspend fun openWithoutSave(screen: Screen)    suspend fun back()}