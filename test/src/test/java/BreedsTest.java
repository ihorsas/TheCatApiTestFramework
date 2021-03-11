import model.Breed;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static client.request.BreedsRequest.getBreeds;
import static client.request.BreedsRequest.getSpecificBreed;

public class BreedsTest {

    @Test
    public void getAllBreedsTest() {
        SoftAssert softAssert = new SoftAssert();
        List<Breed> breeds = getBreeds();
        Assert.assertTrue(breeds.size() > 0, "Breeds are empty");
        String errorMessage = "Breed %s is emptyv for: %s";
        for(Breed breed : breeds) {
            softAssert.assertNotNull(breed.getId(), String.format(errorMessage, "id", breed));
            softAssert.assertNotNull(breed.getDescription(), String.format(errorMessage, "description", breed));
            softAssert.assertNotNull(breed.getName(), String.format(errorMessage, "name", breed));
            softAssert.assertNotNull(breed.getLifeSpan(), String.format(errorMessage, "life_span", breed));
        }
        softAssert.assertAll();
    }

    @Test
    public void getSiberianBreedTest() {
        String expectedDescription = "The Siberians dog like temperament and affection makes the ideal lap cat and will live quite happily indoors. Very agile and powerful, the Siberian cat can easily leap and reach high places, including the tops of refrigerators and even doors. ";
        String expectedName = "Siberian";
        String expectedId = "sibe";
        String expectedOrigin = "Russia";
        String expectedCountryCode = "RU";

        SoftAssert softAssert = new SoftAssert();
        List<Breed> breeds = getSpecificBreed("Siberian");
        Assert.assertTrue(breeds.size() > 0, "Breeds a1re empty");
        Assert.assertEquals(breeds.size(), 1, "There's more then 1 siberian breeds");
        String errorMessage = "Breed %s is not as expected";
        Breed breed = breeds.get(0);
        softAssert.assertEquals(breed.getId(), expectedId, String.format(errorMessage, breed));
        softAssert.assertEquals(breed.getDescription(), expectedDescription, String.format(errorMessage, breed));
        softAssert.assertEquals(breed.getName(), expectedName, String.format(errorMessage, breed));
        softAssert.assertEquals(breed.getOrigin(), expectedOrigin, String.format(errorMessage, breed));
        softAssert.assertEquals(breed.getCountryCode(), expectedCountryCode, String.format(errorMessage, breed));
        softAssert.assertAll();
    }
}
