package uz.gita.contact_app_with_firebase.presenter.screens.mainimport kotlinx.coroutines.flow.StateFlowimport uz.gita.contact_app_with_firebase.data.models.ContactParaminterface MainContract {    interface ViewModel {        val uiState: StateFlow<UIState>        fun onEventDispatcher(intent: Intent)    }    data class UIState(        val ls: List<ContactParam> = emptyList(),    )    interface Intent {        data class MoveToUpdate(            val contactParam: ContactParam,        ) : Intent        data class DeleteContact(            val contactParam: ContactParam,        ) : Intent        object MoveToAdd : Intent        object LoadContacts: Intent    }    interface MainDirection {        suspend fun openUpdateScreen(contactParam: ContactParam)        suspend fun openAddScreen()    }}