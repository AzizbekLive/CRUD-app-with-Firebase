package uz.gita.contact_app_with_firebase.utilsimport androidx.compose.foundation.text.KeyboardActionsimport androidx.compose.foundation.text.KeyboardOptionsimport androidx.compose.material3.OutlinedTextFieldimport androidx.compose.material3.Textimport androidx.compose.runtime.Composableimport androidx.compose.runtime.getValueimport androidx.compose.runtime.mutableStateOfimport androidx.compose.runtime.rememberimport androidx.compose.runtime.setValueimport androidx.compose.ui.Modifierimport androidx.compose.ui.text.input.ImeActionimport androidx.compose.ui.text.input.KeyboardTypeimport androidx.compose.ui.tooling.preview.Preview@Composablefun MaskedPhoneTextField(    phone: String,    onValueChange: (String) -> Unit,    modifier: Modifier = Modifier) {    var formattedPhone by remember(phone) {        mutableStateOf(formatPhoneNumber(phone))    }    OutlinedTextField(        value = formattedPhone,        onValueChange = {            formattedPhone = it            onValueChange(it.filter { it.isDigit() })        },        label = { Text("Phone") },        keyboardOptions = KeyboardOptions(            keyboardType = KeyboardType.Number,            imeAction = ImeAction.Done        ),        keyboardActions = KeyboardActions(            onDone = {  }        ),        modifier = modifier    )}private fun formatPhoneNumber(phone: String): String {    return if (!phone.startsWith("+998")) {        "+998$phone"    } else {        phone    }}@Preview@Composablefun MaskedPhoneTextFieldPreview() {    var phone by remember { mutableStateOf("") }    MaskedPhoneTextField(        phone = phone,        onValueChange = { phone = it }    )}