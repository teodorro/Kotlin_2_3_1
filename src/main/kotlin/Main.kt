fun main() {
    WallService.add(getPost1(1))
    WallService.add(getPost2(11))

    WallService.print()
}

fun getPost1(id: Int): Post{
    return Post(id, 2, 3, 4, 5, "asd", 6, 7, true,
        Comments(1, true, true, true, true),
        "asd",
        Likes(1, true, true, true),
        Views(2), "qw",
        PostSource("zxc", "xcv", "cvb", "vbn"),
        Geo("qwe", "1:2", Place(1, "ert", 2, 3, 4, "rty", 5, 6, 7, 8, 9, "tyu")),
        3,
        null,
        true, true, true, true, true, true, true)
}

fun getPost2(id: Int): Post{
    return Post(id, 12, 13, 14, 15, "1asd", 16, 17, true,
        Comments(11, true, true, true, true),
        "1asd",
        Likes(11, true, true, true),
        Views(12), "1qw",
        PostSource("zxc", "xcv", "cvb", "vbn"),
        Geo("qwe", "1:2", Place(11, "ert", 12, 13, 14, "rty", 15, 16, 17, 18, 19, "tyu")),
        13,
        null,
        true, true, true, true, true, true, true)
}