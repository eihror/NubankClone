package com.eihror.learningjetpack.ui.views.widgets.toolbar

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eihror.learningjetpack.R
import com.eihror.learningjetpack.ui.theme.mediumPurple

@Composable
fun MainToolbar(name: String, modifier: Modifier, onToggleClickListener: () -> Unit, onSettingsClick: () -> Unit) {
    Column(modifier = modifier
            .fillMaxWidth(),
            verticalArrangement = Arrangement.Center) {
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Text(
                    text = "Olá, $name",
                    style = TextStyle(color= Color.White, fontSize = 30.sp, fontWeight = FontWeight.Bold)
            )
            Row {
                Button(
                        onClick = onToggleClickListener,
                        modifier = Modifier
                                .width(48.dp)
                                .height(48.dp),
                        colors = ButtonConstants.defaultButtonColors(backgroundColor = mediumPurple),
                        shape = CircleShape
                ) {
                    Icon(imageVector = vectorResource(id = R.drawable.ic_visibility_on),
                            tint = Color.White,
                            modifier = Modifier
                                    .width(20.dp)
                                    .height(20.dp)
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(
                        onClick = onSettingsClick,
                        modifier = Modifier
                                .width(48.dp)
                                .height(48.dp),
                        colors = ButtonConstants.defaultButtonColors(backgroundColor = mediumPurple),
                        shape = CircleShape
                ) {
                    Icon(imageVector = vectorResource(id = R.drawable.ic_settings),
                            tint = Color.White,
                            modifier = Modifier
                                    .width(16.dp)
                                    .height(16.dp)
                    )
                }
            }
        }
    }
}