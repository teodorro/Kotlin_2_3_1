package Attachments

class AttachmentNote (override val type: String, note: Note) : Attachment{
    val note: Note = note
}