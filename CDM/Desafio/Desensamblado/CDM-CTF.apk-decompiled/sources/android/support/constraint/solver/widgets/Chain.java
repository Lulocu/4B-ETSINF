package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;

/* access modifiers changed from: package-private */
public class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        ChainHead[] chainHeadArr;
        int i2;
        int i3;
        if (i == 0) {
            int i4 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            i2 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
        }
        for (int i5 = 0; i5 < i2; i5++) {
            ChainHead chainHead = chainHeadArr[i5];
            chainHead.define();
            if (!constraintWidgetContainer.optimizeFor(4)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            } else if (!Optimizer.applyChainOptimized(constraintWidgetContainer, linearSystem, i, i3, chainHead)) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i3, chainHead);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v63, resolved type: android.support.constraint.solver.widgets.ConstraintWidget */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.mHorizontalChainStyle == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.mVerticalChainStyle == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0488  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04e2  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x050a  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0395 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x019a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void applyChainConstraints(android.support.constraint.solver.widgets.ConstraintWidgetContainer r37, android.support.constraint.solver.LinearSystem r38, int r39, int r40, android.support.constraint.solver.widgets.ChainHead r41) {
        /*
        // Method dump skipped, instructions count: 1336
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.Chain.applyChainConstraints(android.support.constraint.solver.widgets.ConstraintWidgetContainer, android.support.constraint.solver.LinearSystem, int, int, android.support.constraint.solver.widgets.ChainHead):void");
    }
}
