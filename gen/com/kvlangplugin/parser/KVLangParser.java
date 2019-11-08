// This is a generated file. Not intended for manual editing.
package com.kvlangplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.kvlangplugin.psi.KVLangTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class KVLangParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return kvLangFile(b, l + 1);
  }

  /* ********************************************************** */
  // rule*
  public static boolean body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "body")) return false;
    Marker m = enter_section_(b, l, _NONE_, BODY, "<body>");
    while (true) {
      int c = current_position_(b);
      if (!rule(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "body", c)) break;
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // python_expr | (INDENT pyvy_block DEDENT)
  public static boolean callback_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callback_stmt")) return false;
    if (!nextTokenIs(b, "<callback stmt>", INDENT, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CALLBACK_STMT, "<callback stmt>");
    r = python_expr(b, l + 1);
    if (!r) r = callback_stmt_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // INDENT pyvy_block DEDENT
  private static boolean callback_stmt_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "callback_stmt_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INDENT);
    r = r && pyvy_block(b, l + 1);
    r = r && consumeToken(b, DEDENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '<' CLASS_NAME '@' CLASS_NAME ('+' CLASS_NAME)* '>:' INDENT style_body DEDENT
  public static boolean dynamic(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DYNAMIC, "<dynamic>");
    r = consumeToken(b, "<");
    r = r && consumeToken(b, CLASS_NAME);
    r = r && consumeToken(b, "@");
    r = r && consumeToken(b, CLASS_NAME);
    r = r && dynamic_4(b, l + 1);
    r = r && consumeToken(b, ">:");
    r = r && consumeToken(b, INDENT);
    r = r && style_body(b, l + 1);
    r = r && consumeToken(b, DEDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ('+' CLASS_NAME)*
  private static boolean dynamic_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!dynamic_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dynamic_4", c)) break;
    }
    return true;
  }

  // '+' CLASS_NAME
  private static boolean dynamic_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dynamic_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "+");
    r = r && consumeToken(b, CLASS_NAME);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // version_stmt (import_stmt|include_stmt|set_stmt)*
  public static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, HEADER, "<header>");
    r = version_stmt(b, l + 1);
    r = r && header_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (import_stmt|include_stmt|set_stmt)*
  private static boolean header_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!header_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "header_1", c)) break;
    }
    return true;
  }

  // import_stmt|include_stmt|set_stmt
  private static boolean header_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_1_0")) return false;
    boolean r;
    r = import_stmt(b, l + 1);
    if (!r) r = include_stmt(b, l + 1);
    if (!r) r = consumeToken(b, SET_STMT);
    return r;
  }

  /* ********************************************************** */
  // '#:' import NAME PKG_NAME
  public static boolean import_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "import_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IMPORT_STMT, "<import stmt>");
    r = consumeToken(b, "#:");
    r = r && consumeTokens(b, 0, IMPORT, NAME, PKG_NAME);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '#:' include force? FILE
  public static boolean include_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INCLUDE_STMT, "<include stmt>");
    r = consumeToken(b, "#:");
    r = r && consumeToken(b, INCLUDE);
    r = r && include_stmt_2(b, l + 1);
    r = r && consumeToken(b, FILE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // force?
  private static boolean include_stmt_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "include_stmt_2")) return false;
    consumeToken(b, FORCE);
    return true;
  }

  /* ********************************************************** */
  // header body?|
  static boolean kvLangFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kvLangFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = kvLangFile_0(b, l + 1);
    if (!r) r = consumeToken(b, KVLANGFILE_1_0);
    exit_section_(b, m, null, r);
    return r;
  }

  // header body?
  private static boolean kvLangFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kvLangFile_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header(b, l + 1);
    r = r && kvLangFile_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // body?
  private static boolean kvLangFile_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "kvLangFile_0_1")) return false;
    body(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NAME ':' callback_stmt
  public static boolean on_property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "on_property")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && consumeToken(b, ":");
    r = r && callback_stmt(b, l + 1);
    exit_section_(b, m, ON_PROPERTY, r);
    return r;
  }

  /* ********************************************************** */
  // NAME ':' INDENT style_body DEDENT
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, INDENT);
    r = r && style_body(b, l + 1);
    r = r && consumeToken(b, DEDENT);
    exit_section_(b, m, PROPERTY, r);
    return r;
  }

  /* ********************************************************** */
  // NAME
  public static boolean python_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "python_expr")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NAME);
    exit_section_(b, m, PYTHON_EXPR, r);
    return r;
  }

  /* ********************************************************** */
  public static boolean pyvy_block(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, PYVY_BLOCK, true);
    return true;
  }

  /* ********************************************************** */
  // CLASS_NAME ':' INDENT style_body DEDENT
  public static boolean root(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "root")) return false;
    if (!nextTokenIs(b, CLASS_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CLASS_NAME);
    r = r && consumeToken(b, ":");
    r = r && consumeToken(b, INDENT);
    r = r && style_body(b, l + 1);
    r = r && consumeToken(b, DEDENT);
    exit_section_(b, m, ROOT, r);
    return r;
  }

  /* ********************************************************** */
  // style|root|dynamic
  public static boolean rule(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "rule")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RULE, "<rule>");
    r = style(b, l + 1);
    if (!r) r = root(b, l + 1);
    if (!r) r = dynamic(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '<' CLASS_NAME '>:' INDENT style_body DEDENT
  public static boolean style(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "style")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STYLE, "<style>");
    r = consumeToken(b, "<");
    r = r && consumeToken(b, CLASS_NAME);
    r = r && consumeToken(b, ">:");
    r = r && consumeToken(b, INDENT);
    r = r && style_body(b, l + 1);
    r = r && consumeToken(b, DEDENT);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // property|on_property|widget
  public static boolean style_body(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "style_body")) return false;
    if (!nextTokenIs(b, "<style body>", NAME, WIDGET)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STYLE_BODY, "<style body>");
    r = property(b, l + 1);
    if (!r) r = on_property(b, l + 1);
    if (!r) r = consumeToken(b, WIDGET);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // '#:' kivy VER
  public static boolean version_stmt(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "version_stmt")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VERSION_STMT, "<version stmt>");
    r = consumeToken(b, "#:");
    r = r && consumeTokens(b, 0, KIVY, VER);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
