package Attachments

class AttachmentPhoto (override val type: String, photo: Photo) : Attachment{
    val photo: Photo = photo
}