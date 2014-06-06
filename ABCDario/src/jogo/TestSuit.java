package jogo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fga.mds.abcdario.model.test.TestGameModel;
import fga.mds.abcdario.model.test.TestLearnModel;
import fga.mds.abcdario.model.test.TestScoreModel;
import fga.mds.abcdario.persistencia.test.TestGamePersistence;
import fga.mds.abcdario.persistencia.test.TestLearnPersistence;
import fga.mds.abcdario.persistencia.test.TestScorePersistence;


@RunWith(Suite.class)
@SuiteClasses({TestLearnModel.class, TestGameModel.class, TestScoreModel.class, TestScorePersistence.class, TestLearnPersistence.class, TestGamePersistence.class})
public class TestSuit {

}
