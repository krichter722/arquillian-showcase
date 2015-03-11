package org.jboss.arquillian.showcase.universe.graphene;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.junit.suite.Suite;
import org.jboss.arquillian.junit.suite.resolve.ClassResolverStrategy;
import org.jboss.arquillian.warp.WarpTest;
import org.junit.runner.RunWith;

@WarpTest
@Suite(value = "org.jboss.arquillian.showcase.universe.graphene.ConferenceWebClientPageFragmentTestCase", strategy = ClassResolverStrategy.class)
@RunWith(Arquillian.class)
public class GrapheneSuite {

//   @Deployment
//   public static WebArchive deploy() {
//       return Deployments.Client.web()
//               .addClass(Deployments.class);
//   }
}
