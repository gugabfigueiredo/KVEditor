// This is a generated file. Not intended for manual editing.
package com.kvlangplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.kvlangplugin.psi.impl.*;

public interface KVLangTypes {

  IElementType BODY = new KVLangElementType("BODY");
  IElementType CALLBACK_STMT = new KVLangElementType("CALLBACK_STMT");
  IElementType DYNAMIC = new KVLangElementType("DYNAMIC");
  IElementType HEADER = new KVLangElementType("HEADER");
  IElementType IMPORT_STMT = new KVLangElementType("IMPORT_STMT");
  IElementType INCLUDE_STMT = new KVLangElementType("INCLUDE_STMT");
  IElementType ON_PROPERTY = new KVLangElementType("ON_PROPERTY");
  IElementType PROPERTY = new KVLangElementType("PROPERTY");
  IElementType PYTHON_EXPR = new KVLangElementType("PYTHON_EXPR");
  IElementType PYVY_BLOCK = new KVLangElementType("PYVY_BLOCK");
  IElementType ROOT = new KVLangElementType("ROOT");
  IElementType RULE = new KVLangElementType("RULE");
  IElementType STYLE = new KVLangElementType("STYLE");
  IElementType STYLE_BODY = new KVLangElementType("STYLE_BODY");
  IElementType VERSION_STMT = new KVLangElementType("VERSION_STMT");

  IElementType CLASS_NAME = new KVLangTokenType("CLASS_NAME");
  IElementType DEDENT = new KVLangTokenType("DEDENT");
  IElementType FILE = new KVLangTokenType("FILE");
  IElementType FORCE = new KVLangTokenType("force");
  IElementType IMPORT = new KVLangTokenType("import");
  IElementType INCLUDE = new KVLangTokenType("include");
  IElementType INDENT = new KVLangTokenType("INDENT");
  IElementType KIVY = new KVLangTokenType("kivy");
  IElementType KVLANGFILE_1_0 = new KVLangTokenType("kvLangFile_1_0");
  IElementType NAME = new KVLangTokenType("NAME");
  IElementType PKG_NAME = new KVLangTokenType("PKG_NAME");
  IElementType SET_STMT = new KVLangTokenType("set_stmt");
  IElementType VER = new KVLangTokenType("VER");
  IElementType WIDGET = new KVLangTokenType("widget");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == BODY) {
        return new KVLangBodyImpl(node);
      }
      else if (type == CALLBACK_STMT) {
        return new KVLangCallbackStmtImpl(node);
      }
      else if (type == DYNAMIC) {
        return new KVLangDynamicImpl(node);
      }
      else if (type == HEADER) {
        return new KVLangHeaderImpl(node);
      }
      else if (type == IMPORT_STMT) {
        return new KVLangImportStmtImpl(node);
      }
      else if (type == INCLUDE_STMT) {
        return new KVLangIncludeStmtImpl(node);
      }
      else if (type == ON_PROPERTY) {
        return new KVLangOnPropertyImpl(node);
      }
      else if (type == PROPERTY) {
        return new KVLangPropertyImpl(node);
      }
      else if (type == PYTHON_EXPR) {
        return new KVLangPythonExprImpl(node);
      }
      else if (type == PYVY_BLOCK) {
        return new KVLangPyvyBlockImpl(node);
      }
      else if (type == ROOT) {
        return new KVLangRootImpl(node);
      }
      else if (type == RULE) {
        return new KVLangRuleImpl(node);
      }
      else if (type == STYLE) {
        return new KVLangStyleImpl(node);
      }
      else if (type == STYLE_BODY) {
        return new KVLangStyleBodyImpl(node);
      }
      else if (type == VERSION_STMT) {
        return new KVLangVersionStmtImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
