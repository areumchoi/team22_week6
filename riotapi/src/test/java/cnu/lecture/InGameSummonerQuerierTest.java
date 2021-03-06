package cnu.lecture;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
/**
 * Created by tchi on 2016. 4. 25..
 */
public class InGameSummonerQuerierTest {
    private InGameSummonerQuerier querier;

    @Before
    public void setup() {
        final String apiKey = "8242f154-342d-4b86-9642-dfa78cdb9d9c";
        GameParticipantListener dontCareListener = mock(GameParticipantListener.class);

        //querier = new InGameSummonerQuerier(apiKey, dontCareListener);
        querier = mock(InGameSummonerQuerier.class);
    }

    @Test
    public void shouldQuerierIdentifyGameKeyWhenSpecificSummonerNameIsGiven() throws Exception {
        final String summonerName = "akane24";

        /*
        GIVEN: {
            summonerName = "akane24";
        }

        final String actualGameKey;
        WHEN: {
            actualGameKey = querier.queryGameKey(summonerName);
        }
		*/
        
        final String expectedGameKey = "4/bl4DC8HBir8w7bGHq6hvuHluBd+3xM";
        
        when(querier.queryGameKey(summonerName)).thenReturn(expectedGameKey);
        /*
        THEN: {
            assertThat(actualGameKey, is(expectedGameKey));
        }
        */
    }
}
