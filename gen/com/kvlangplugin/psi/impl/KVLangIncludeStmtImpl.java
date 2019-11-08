// This is a generated file. Not intended for manual editing.
package com.kvlangplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.kvlangplugin.psi.KVLangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.kvlangplugin.psi.*;

public class KVLangIncludeStmtImpl extends ASTWrapperPsiElement implements KVLangIncludeStmt {

  public KVLangIncludeStmtImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KVLangVisitor visitor) {
    visitor.visitIncludeStmt(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KVLangVisitor) accept((KVLangVisitor)visitor);
    else super.accept(visitor);
  }

}
