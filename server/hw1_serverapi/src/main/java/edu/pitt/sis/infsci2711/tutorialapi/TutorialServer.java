package edu.pitt.sis.infsci2711.tutorialapi;

import edu.pitt.sis.infsci2711.multidbs.utils.JerseyJettyServer;

public class TutorialServer {
	
	public static void main(final String[] args) throws Exception {
		JerseyJettyServer server = new JerseyJettyServer(8654, "edu.pitt.sis.infsci2711.tutorialapi.rest");
		server.start();
	}
}