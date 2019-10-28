package com.example.lucas.chatapplication.models

class ChatMessage(val text: String, val fromid: String, val toid:String, val timestamp: Long ){
    constructor():this("","","",-1)
}