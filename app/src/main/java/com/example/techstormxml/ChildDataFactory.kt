package com.example.techstormxml

import java.util.*

object ChildDataFactory {


    fun getChildrenBrainTesasers() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.codebee, "CODE-BEE"))
        children.add(ItemCard(R.drawable.omegatrix, "OMEGATRIX"))
        children.add(ItemCard(R.drawable.webology, "WEB-O-LOGY"))
        return children
    }
    fun getChildrenideaPresentation() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.technomania, "TECHNOMANIA"))
        children.add(ItemCard(R.drawable.appmania, " APP-MANIA"))

        return children
    }fun rovers() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.ronavigator, "RO NAVIGATOR"))
        children.add(ItemCard(R.drawable.rosoccer, "RO SOCCER"))
        children.add(ItemCard(R.drawable.rocombatlight, "RO COMBAT(light)"))
        children.add(ItemCard(R.drawable.rocombatheavy, "RO COMBAT(heavy)"))
        children.add(ItemCard(R.drawable.ropuzzle, "RO- PUZZLE"))
        children.add(ItemCard(R.drawable.roterrance, "RO-TERRANCE"))
        children.add(ItemCard(R.drawable.powerpull, "POWER-PULL"))
        return children
    }fun games() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.fifa, "FIFA"))
        children.add(ItemCard(R.drawable.pes, "PES"))
        children.add(ItemCard(R.drawable.khet, "KHET(Intra-College)"))
        return children
    }fun creativeevents() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.passionwithreels, " PASSION WITH REELS"))

        return children
    }
    fun gamesextra() : List<ItemCard>{
        val children = mutableListOf<ItemCard>()

        children.add(ItemCard(R.drawable.valorent, "VALORANT"))

        return children
    }
}