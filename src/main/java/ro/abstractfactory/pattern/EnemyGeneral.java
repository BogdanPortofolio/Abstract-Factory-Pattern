package ro.abstractfactory.pattern;

public class EnemyGeneral implements General {

static final String DESCRIPTION = "This is the Enemy General!";
	
	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
