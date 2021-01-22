package com.eihror.learningjetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import com.eihror.learningjetpack.model.CARD_TYPES
import com.eihror.learningjetpack.model.MenuItem
import com.eihror.learningjetpack.ui.views.MainView

class MainActivity : AppCompatActivity() {
    val mediumList: MutableList<CARD_TYPES> = mutableListOf(CARD_TYPES.TYPE_CREDIT_CARD, CARD_TYPES.TYPE_ACCOUNT, CARD_TYPES.TYPE_PIX, CARD_TYPES.TYPE_LOANS, CARD_TYPES.TYPE_REWARDS)

    val menuList = mutableListOf(
            MenuItem(icon = R.drawable.ic_settings, title = R.string.pix),
            MenuItem(icon = R.drawable.ic_settings, title = R.string.payment),
            MenuItem(icon = R.drawable.ic_settings, title = R.string.invite_friends),
            MenuItem(icon = R.drawable.ic_settings, title = R.string.transfer),
            MenuItem(icon = R.drawable.ic_settings, title = R.string.deposit),
            MenuItem(icon = R.drawable.ic_settings, title = R.string.loan),
            MenuItem(icon = R.drawable.ic_settings, title = R.string.virtual_card),
            MenuItem(icon = R.drawable.ic_settings, title = R.string.mobile_recharge),
            MenuItem(icon = R.drawable.ic_settings, title = R.string.adjust_limit),
            MenuItem(icon = R.drawable.ic_settings, title = R.string.block_card)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView(mediumList, menuList)
        }
    }
}