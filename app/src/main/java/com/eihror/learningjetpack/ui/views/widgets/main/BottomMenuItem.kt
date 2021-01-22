package com.eihror.learningjetpack.ui.views.widgets.main

import android.widget.Toast
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AmbientContext
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eihror.learningjetpack.R
import com.eihror.learningjetpack.model.MenuItem
import com.eihror.learningjetpack.ui.theme.mediumPurple

@Composable
fun BottomMenu(menuList: MutableList<MenuItem>, modifier: Modifier, onItemClickListener: (Int) -> Unit) {
    ScrollableRow(modifier = modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        menuList.forEachIndexed { index, item ->
            BottomMenuItem(item, onItemClickListener)
        }
    }
}

@Composable
fun BottomMenuItem(element: MenuItem, onClickListener: (Int) -> Unit) {
    Row {
        Box(modifier = Modifier
                .width(90.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(4.dp))
                .background(mediumPurple)
                .clickable(onClick = { onClickListener.invoke(1) })) {
                Column(modifier = Modifier.fillMaxSize()
                                        .padding(8.dp),
                        verticalArrangement = Arrangement.SpaceBetween) {
                    Icon(imageVector = vectorResource(id = element.icon),
                            tint = Color.White,
                            modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                    )
                    Text(text = AmbientContext.current.getString(element.title), color = Color.White, fontSize = 12.sp)
                }
        }
        Spacer(modifier = Modifier.width(8.dp))
    }
}