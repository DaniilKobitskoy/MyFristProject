package com.example.myapplication321.model

data class Custom(
	val data: List<Data?>? = null,

) {

	data class Data(
		val date: Long? = null,
		val price: Int? = null,
		val count: Int? = null,
		val id: String? = null,
		val numberId: Int? = null,
		val status: Status? = null
	)

	data class Status(
		val color: String? = null,
		val title: String? = null
	)

	data class Meta(
		val code: Int? = null,
		val message: Boolean? = null,
		val status: Boolean? = null
	)

}