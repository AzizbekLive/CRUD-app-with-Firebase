package uz.gita.contact_app_with_firebase.domain.usecase.implimport uz.gita.contact_app_with_firebase.domain.repository.AppRepositoryimport uz.gita.contact_app_with_firebase.domain.usecase.InsertContactUseCaseimport javax.inject.Injectclass InsertContactUseCaseImpl @Inject constructor(    private val appRepository: AppRepository,) : InsertContactUseCase {    override fun invoke(image: String, name: String, phone: String) =        appRepository.insertContact(image, name, phone)}