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

public class KVLangHeaderImpl extends ASTWrapperPsiElement implements KVLangHeader {

  public KVLangHeaderImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull KVLangVisitor visitor) {
    visitor.visitHeader(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof KVLangVisitor) accept((KVLangVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<KVLangImportStmt> getImportStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KVLangImportStmt.class);
  }

  @Override
  @NotNull
  public List<KVLangIncludeStmt> getIncludeStmtList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, KVLangIncludeStmt.class);
  }

  @Override
  @NotNull
  public KVLangVersionStmt getVersionStmt() {
    return findNotNullChildByClass(KVLangVersionStmt.class);
  }

}
