package com.eihror.learningjetpack.ui.views.widgets.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumnForIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonConstants
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eihror.learningjetpack.R
import com.eihror.learningjetpack.model.CARD_TYPES
import com.eihror.learningjetpack.ui.theme.celery
import com.eihror.learningjetpack.ui.theme.purple
import com.eihror.learningjetpack.ui.theme.scooter

@Composable
fun CardList(mediumList: MutableList<CARD_TYPES>, modifier: Modifier) {
    LazyColumnForIndexed(items = mediumList, modifier = modifier.padding(start = 16.dp, end = 16.dp)) { _, item ->
        when(item) {
            CARD_TYPES.TYPE_CREDIT_CARD -> CardItem()
            CARD_TYPES.TYPE_ACCOUNT -> AccountItem()
            CARD_TYPES.TYPE_PIX -> PixItem()
            CARD_TYPES.TYPE_LOANS -> LoansItem()
            CARD_TYPES.TYPE_REWARDS -> RewardsItem()
        }
    }
}

@Composable
fun CardItem() {
    Box(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(Color.White)
            .clickable(onClick = {}) ) {
        Column(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                Icon(modifier = Modifier
                        .width(20.dp)
                        .height(20.dp), imageVector = vectorResource(id = R.drawable.ic_settings), tint = Color.Black)
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "Cartão de crédito", fontWeight = FontWeight.Light)
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Fatura atual", color = Color.Black, fontSize = 12.sp, fontWeight = FontWeight.Light)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "R$ 1.500,00", color = scooter, fontSize = 22.sp, fontWeight = FontWeight.Bold)
            val limitDescription = AnnotatedString("Limite disponível ", spanStyle = SpanStyle(color = Color.Black, fontWeight = FontWeight.Light, fontSize = 12.sp))
            val limitValue = AnnotatedString("R$ 15.000,00", spanStyle = SpanStyle(color = celery, fontWeight = FontWeight.Bold, fontSize = 12.sp))
            Text(text = limitDescription.plus(limitValue))
        }
    }
}

@Composable
fun AccountItem() {
    Box(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(Color.White)
            .clickable(onClick = {}) ) {
        Column(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                Icon(modifier = Modifier
                        .width(20.dp)
                        .height(20.dp), imageVector = vectorResource(id = R.drawable.ic_settings), tint = Color.Black)
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "Conta", fontWeight = FontWeight.Light)
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "Saldo disponível", color = Color.Black, fontSize = 12.sp, fontWeight = FontWeight.Light)
            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "R$ 100.000.500,00", color = Color.Black, fontSize = 22.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun PixItem() {
    Box(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(Color.White) ) {
        Column(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                Icon(modifier = Modifier
                        .width(20.dp)
                        .height(20.dp), imageVector = vectorResource(id = R.drawable.ic_settings), tint = Color.Black)
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "Pix", fontWeight = FontWeight.Light)
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Transfira usando o Pix", color = Color.Black, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Pague e receba em tempo real, sem custo e para qualquer banco.", color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.Normal)
            Spacer(modifier = Modifier.height(16.dp))
            Button(shape = RoundedCornerShape(4.dp),
                    colors = ButtonConstants.defaultButtonColors(backgroundColor = Color.White),
                    border = BorderStroke(1.dp, purple),
                    onClick = {}) {
                Text(text = "começar a usar".toUpperCase(), style = TextStyle(color = purple, fontWeight = FontWeight.Bold))
            }
        }
    }
}

@Composable
fun LoansItem() {
    Box(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(Color.White) ) {
        Column(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                Icon(modifier = Modifier
                        .width(20.dp)
                        .height(20.dp), imageVector = vectorResource(id = R.drawable.ic_settings), tint = Color.Black)
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "Empréstimo", fontWeight = FontWeight.Light)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Valor disponível de até", color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.Normal)
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "R$ 12.900,00", color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(16.dp))
            Button(shape = RoundedCornerShape(4.dp),
                    colors = ButtonConstants.defaultButtonColors(backgroundColor = Color.White),
                    border = BorderStroke(1.dp, purple),
                    onClick = {}) {
                Text(text = "simular empréstimo".toUpperCase(), style = TextStyle(color = purple, fontWeight = FontWeight.Bold))
            }
        }
    }
}

@Composable
fun RewardsItem() {
    Box(modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp)
            .clip(RoundedCornerShape(4.dp))
            .background(Color.White) ) {
        Column(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Row(horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                Icon(modifier = Modifier
                        .width(20.dp)
                        .height(20.dp), imageVector = vectorResource(id = R.drawable.ic_settings), tint = Color.Black)
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "Rewards", fontWeight = FontWeight.Normal, fontSize = 22.sp, color = purple)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Apague compras com pontos que nunca expiram.", color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.Normal)
            Spacer(modifier = Modifier.height(16.dp))
            Button(shape = RoundedCornerShape(4.dp),
                    colors = ButtonConstants.defaultButtonColors(backgroundColor = Color.White),
                    border = BorderStroke(1.dp, purple),
                    onClick = {}) {
                Text(text = "conhecer".toUpperCase(), style = TextStyle(color = purple, fontWeight = FontWeight.Bold))
            }
        }
    }
}

/* region Previews */
@Preview(name= "Card Item Preview")
@Composable
fun PreviewCardItem() {
    CardItem()
}

@Preview(name= "Card Account Preview")
@Composable
fun PreviewCardAccount() {
    AccountItem()
}

@Preview(name= "Card Pix Preview")
@Composable
fun PreviewCardPix() {
    PixItem()
}

@Preview(name= "Card Loans Preview")
@Composable
fun PreviewCardLoans() {
    LoansItem()
}

@Preview(name= "Card Rewards Preview")
@Composable
fun PreviewCardRewards() {
    RewardsItem()
}
/* endregion Previews */