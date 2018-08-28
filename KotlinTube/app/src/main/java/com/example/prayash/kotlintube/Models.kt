package com.example.prayash.kotlintube

class HomeFeed(val videos: List<Video>)

class Video(val id: Int, val name: String, val link: String, val imageUrl: String,
            numberOfViews: Int, val channel: Channel)

class Channel(val name: String, val profileImageUrl: String)

class VideoDetail(val name: String, val duration: String, val number: Int, val imageUrl: String, val link: String)