package uz.gita.contact_app_with_firebase.presenter.screens.addimport android.net.Uriinterface AddContract {    interface ViewModel {        fun onEventDispatcher(intent: Intent)    }    interface Intent {        data class AddContact(            val image: String,            val name: String,            val phone: String,        ) : Intent        object MoveToMain : Intent    }    interface AddDirection {        suspend fun openMain()    }}