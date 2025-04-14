package course1.task1.hero;

import course1.task1.skill.ArcheryAbility;
import course1.task1.skill.InvisibleAbility;
import course1.task1.skill.SilentAbility;
import course1.task1.skill.VertigoAbility;
import course1.task1.skill.imp.ArcheryImp;
import course1.task1.skill.imp.InvisibleImp;
import course1.task1.skill.imp.SilentImp;
import course1.task1.skill.imp.VertigoImp;

public class HeroXiangYu implements InvisibleImp, SilentImp, ArcheryImp, VertigoImp {

    private final ArcheryAbility archeryAbility = new ArcheryAbility();
    private final InvisibleAbility invisibleAbility = new InvisibleAbility();
    private final SilentAbility silentAbility = new SilentAbility();
    private final VertigoAbility vertigoAbility = new VertigoAbility();

    @Override
    public void doArchery() {
        archeryAbility.doArchery();
    }

    @Override
    public void doInvisible() {
        invisibleAbility.doInvisible();
    }

    @Override
    public void doSilent() {
        silentAbility.doSilent();
    }

    @Override
    public void doVertigo() {
        vertigoAbility.doVertigo();
    }
}
