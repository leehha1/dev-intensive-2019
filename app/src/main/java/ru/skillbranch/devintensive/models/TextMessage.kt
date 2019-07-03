package ru.skillbranch.devintensive.models


import java.util.*

class TextMessage(
    id:String,
    from:User?,
    chat:Chat,
    isIncoming : Boolean = false,
    date:Date = Date(),
    var text:String?
) :BaseMassage(id, from, chat, isIncoming, date) {
    override fun formatMessage(): String = "id:$id ${from?.firstName} " +
            "${if(isIncoming) "poluchil" else "otpravil"} сообщение \"$text\" "
}