package com.helloworld.helloworldplugin

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class TestClass: AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog("Test class function", "Test class", Messages.getInformationIcon())
    }
}