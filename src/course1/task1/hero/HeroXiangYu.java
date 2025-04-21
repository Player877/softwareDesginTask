package course1.task1.hero;

import course1.task1.skill.*;
import course1.task1.skill.imp.*;

public class HeroXiangYu implements InvisibleImp, SilentImp, DisplacementImp {

    private final InvisibleAbility invisibleAbility = new InvisibleAbility();
    private final SilentAbility silentAbility = new SilentAbility();
    private final DisplacementAbility displacementAbility = new DisplacementAbility();

    @Override
    public void doInvisible() {
        invisibleAbility.doInvisible();
    }

    @Override
    public void doSilent() {
        silentAbility.doSilent();
    }

    @Override
    public void doDisplacement() {
        displacementAbility.doDisplacement();
    }
}
