package br.com.marcosporto.imc.extensions

fun Double.format(digits: Int) = String.format("%.${digits}f", this)