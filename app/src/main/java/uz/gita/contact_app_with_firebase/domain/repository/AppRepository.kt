package uz.gita.contact_app_with_firebase.domain.repositoryimport kotlinx.coroutines.flow.Flowimport uz.gita.contact_app_with_firebase.data.models.ContactParaminterface AppRepository {    fun getAllContacts(): Flow<Result<List<ContactParam>>>    fun insertContact(image: String, name: String, phone: String)    fun deleteContact(id: String)    fun updateContact(id: String, image: String, name: String, phone: String)}