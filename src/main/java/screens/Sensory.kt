package screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.chris.ouichefcompose.R
import dev.chris.ouichefcompose.ui.theme.ExpandableCard
import dev.chris.ouichefcompose.ui.theme.OuiChefComposeTheme
import navigation.Screen

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Sensory(navController: NavController) {
    OuiChefComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background( MaterialTheme.colors.primary)
                .verticalScroll(rememberScrollState(), enabled = true)

        )  {
            Box(
                modifier = Modifier

                    .fillMaxWidth(),
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                        .padding(16.dp, 8.dp, 16.dp, 8.dp),
                    painter = painterResource(R.drawable.sensory1),
                    contentDescription = "Title",
                    contentScale = ContentScale.Crop,

                    )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                Text(   fontSize = 20.sp,
                    color =  MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.sensory_intro))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleTextures = "Textures & Shapes "
                val infoTextures = stringResource(R.string.textures)
                ExpandableCard(title = titleTextures, description = infoTextures, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleFlavors = "Flavors"
                val infoFlavors = stringResource(R.string.flavors)
                ExpandableCard(title = titleFlavors, description = infoFlavors, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp ),
            ) {
                val titleWine = "Wine and Food"
                val infoWine = stringResource(R.string.wine_food_compensate)
                ExpandableCard(title = titleWine, description = infoWine, textColor =  MaterialTheme.colors.primaryVariant)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .absolutePadding(28.dp, 28.dp, 28.dp)
            ) {
                Text(
                    fontSize = 20.sp,
                    color = MaterialTheme.colors.primaryVariant,
                    text = stringResource(R.string.next_chapter6))

                Spacer(modifier = Modifier
                    .padding(0.dp, 40.dp)
                    .fillMaxWidth())
            }
            Row(modifier = Modifier
                .fillMaxWidth(),
                Arrangement.Center) {
                Button(  modifier = Modifier
                    .padding(0.dp,15.dp,0.dp,15.dp),
                    colors = ButtonDefaults.buttonColors( MaterialTheme.colors.secondary),
                    onClick = {navController.navigate(Screen.PuttingItAllTogether.route)
                    {popUpTo(Screen.HomeScreen.route)}
                    }) {
                    Text(fontSize = 20.sp,
                        color =  MaterialTheme.colors.primaryVariant,
                        text = "Oui Chef!")

                }

            }
        }
    }


}