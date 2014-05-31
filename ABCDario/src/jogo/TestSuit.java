package jogo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fga.mds.abcdario.model.test.TestGameModel;
import fga.mds.abcdario.model.test.TestLearnModel;


@RunWith(Suite.class)
@SuiteClasses({TestLearnModel.class, TestGameModel.class})
public class TestSuit {

}
