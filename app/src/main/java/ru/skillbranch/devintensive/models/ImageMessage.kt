package ru.skillbranch.devintensive.models

import java.util.*

class ImageMessage(
    id:String,
    from:User?,
    chat:Chat,
    isIncoming : Boolean = false,
    date: Date = Date(),
    var image:String?
) :BaseMassage(id, from, chat, isIncoming, date)  {
    override fun formatMessage(): String = "id:$id ${from?.firstName} " +
            "${if(isIncoming) "poluchil" else "otpravil"} изображение \"$image\" "
}