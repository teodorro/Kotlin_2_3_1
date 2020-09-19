package Attachments

class AttachmentVideo (override val type: String, video: Video) : Attachment{
    val video: Video = video
}