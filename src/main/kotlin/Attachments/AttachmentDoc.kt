package Attachments

class AttachmentDoc (override val type: String, doc: Document) : Attachment{
    val doc: Document = doc
}