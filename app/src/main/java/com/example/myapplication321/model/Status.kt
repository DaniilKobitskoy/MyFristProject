package com.example.myapplication321.model

data class Status(
	val data: List<DataItem?>? = null,

)

data class DataItem(
	val id: String? = null,
	val title: String? = null,
	val count: Int? = null
)

data class Meta(
	val code: Int? = null,
	val message: Boolean? = null,
	val status: Boolean? = null
)

