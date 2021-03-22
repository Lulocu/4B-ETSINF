package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;

/* access modifiers changed from: package-private */
public class Chain {
    private static final boolean DEBUG = false;

    Chain() {
    }

    static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, int i) {
        int i2;
        ChainHead[] chainHeadArr;
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

    /* JADX WARNING: Removed duplicated region for block: B:207:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0509  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void applyChainConstraints(android.support.constraint.solver.widgets.ConstraintWidgetContainer r35, android.support.constraint.solver.LinearSystem r36, int r37, int r38, android.support.constraint.solver.widgets.ChainHead r39) {
        /*
        // Method dump skipped, instructions count: 1355
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.solver.widgets.Chain.applyChainConstraints(android.support.constraint.solver.widgets.ConstraintWidgetContainer, android.support.constraint.solver.LinearSystem, int, int, android.support.constraint.solver.widgets.ChainHead):void");
    }
}
