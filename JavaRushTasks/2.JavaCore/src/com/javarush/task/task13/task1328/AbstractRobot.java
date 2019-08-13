package com.javarush.task.task13.task1328;

public abstract class AbstractRobot implements Attackable, Defensable {
    private static int hitCountA;
    private static int hitCountD;

    @Override
    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCountA = hitCountA + 1;
        if (hitCountA == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCountA == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCountA == 3) {
            attackedBodyPart = BodyPart.LEG;
        } else if (hitCountA == 4) {
            attackedBodyPart = BodyPart.CHEST;
            hitCountA = 0;
        }
        return attackedBodyPart;
    }

    @Override
    public BodyPart defense() {
        BodyPart defendedBodyPart = null;
        hitCountD = hitCountD + 1;

        if (hitCountD == 1) {
            defendedBodyPart = BodyPart.HEAD;
        } else if (hitCountD == 2) {
            defendedBodyPart = BodyPart.LEG;
        } else if (hitCountD == 3) {
            defendedBodyPart = BodyPart.ARM;
        } else if (hitCountD == 4) {
            defendedBodyPart = BodyPart.CHEST;
            hitCountD = 0;
        }
        return defendedBodyPart;
    }

    public abstract Object getName();
}
