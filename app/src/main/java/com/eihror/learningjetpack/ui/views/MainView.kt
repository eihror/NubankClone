package com.eihror.learningjetpack.ui.views

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eihror.learningjetpack.R
import com.eihror.learningjetpack.model.CARD_TYPES
import com.eihror.learningjetpack.model.MenuItem
import com.eihror.learningjetpack.ui.theme.purple
import com.eihror.learningjetpack.ui.views.widgets.main.BottomMenu
import com.eihror.learningjetpack.ui.views.widgets.main.CardList
import com.eihror.learningjetpack.ui.views.widgets.toolbar.MainToolbar

@Composable
fun MainView(mediumList: MutableList<CARD_TYPES>, menuList: MutableList<MenuItem>) {
    val context = AmbientContext.current
    ConstraintLayout(modifier = Modifier.fillMaxSize().background(purple)) {
        val (toolbar, cardList, bottomMenuList) = createRefs()

        MainToolbar(name = "Eihror", onToggleClickListener = { /*TODO*/ }, onSettingsClick = { /*TODO*/ }, modifier = Modifier.constrainAs(toolbar) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })

        CardList(mediumList = mediumList, modifier = Modifier.constrainAs(cardList) {
            top.linkTo(toolbar.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            bottom.linkTo(bottomMenuList.top, margin = 16.dp)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        BottomMenu(menuList = menuList,
                modifier = Modifier.constrainAs(bottomMenuList) {
                    bottom.linkTo(parent.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
                onItemClickListener = {
                    Toast.makeText(context, "cliquei", Toast.LENGTH_SHORT).show()
                }
        )
    }
}

@Preview
@Composable
fun preview() {
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
    MainView(mediumList, menuList)
}