package uz.gita.contact_app_with_firebase.domain.usecase.implimport kotlinx.coroutines.flow.Flowimport uz.gita.contact_app_with_firebase.data.models.ContactParamimport uz.gita.contact_app_with_firebase.domain.repository.AppRepositoryimport uz.gita.contact_app_with_firebase.domain.usecase.GetContactsUseCaseimport javax.inject.Injectclass GetContactsUseCaseImpl @Inject constructor(    private val repository: AppRepository,) : GetContactsUseCase {    override fun invoke(): Flow<Result<List<ContactParam>>> = repository.getAllContacts()}