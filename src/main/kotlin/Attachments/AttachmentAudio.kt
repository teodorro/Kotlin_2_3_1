package Attachments

class AttachmentAudio(override val type: String, audio: Audio) : Attachment{
    val audio: Audio = audio
}