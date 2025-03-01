package de.htwg.se.maumau.util

import de.htwg.se.maumau.Maumau
import de.htwg.se.maumau.aview.{TUI, Welcome}
import de.htwg.se.maumau.controller.controllerComponent.controllerBaseImpl.Controller
import de.htwg.se.maumau.model.gameComponents.gameBaseImpl.Table

import java.security.KeyStore.TrustedCertificateEntry
import de.htwg.se.maumau.util.Observer
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

import java.io.ByteArrayInputStream
import scala.collection.mutable.Stack

class UndoManagerSpec extends AnyWordSpec with Matchers {
  "An UndoManager" when {
    "new" should {
      val table = Table()
      val controller = new Controller()
      val welcome = new Welcome(controller)
      val tui = TUI(controller)
      welcome.welcome()

      "witch empty stack" in {
        controller.tables = Stack[Table]()
        controller.states = Stack[String]("")
        State.state=""
        tui.processInputLine("redo") should be("invalid redo")
        controller.undo should be()
        controller.redo should be()
        State.state=""
        tui.processInputLine("undo") should be("invalid undo")
      }


    }
  }
}