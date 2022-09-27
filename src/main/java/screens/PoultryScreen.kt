package screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dev.chris.ouichefcompose.R
import dev.chris.ouichefcompose.ui.theme.ExpandableCard
import dev.chris.ouichefcompose.ui.theme.OuiChefComposeTheme

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Poultry(navController: NavController) {
    OuiChefComposeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.primary)
                .verticalScroll(rememberScrollState(), enabled = true)

        ) {
            Box() {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp),
                ) {
                    val titleChicken = "Poultry"
                    val infoChicken = stringResource(R.string.poultry_cut)
                    ExpandableCard(
                        title = titleChicken,
                        description = infoChicken,
                        textColor = MaterialTheme.colors.primaryVariant
                    )}
                }
                Box(
                    modifier = Modifier

                        .fillMaxWidth(),
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)
                            .padding(28.dp, 8.dp, 16.dp, 28.dp),
                        painter = painterResource(R.drawable.chicken_cut1),
                        contentDescription = "chickenCut"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp)
                ) {
                    val titleChicken = "Utilizing Chicken"
                    val  infoChicken= stringResource(R.string.utilizing_chicken)
                    ExpandableCard(
                        title = titleChicken,   description = infoChicken,
                        textColor = MaterialTheme.colors.primaryVariant)
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .absolutePadding(28.dp, 28.dp, 28.dp)
                ) {
                    val titleDuck = "Tips On Cooking Duck"
                    val  infoDuck= stringResource(R.string.cooking_tip_duck)
                    ExpandableCard(
                        title = titleDuck,   description =infoDuck,
                        textColor = MaterialTheme.colors.primaryVariant)
                }

            }
        }
    }




