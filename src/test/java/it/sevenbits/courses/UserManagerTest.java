package it.sevenbits.courses;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;


import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class UserManagerTest {
    private ICollection mockCollection;
    private UserManager userManager;

    @Before
    public void setUp() {
        mockCollection = mock(ICollection.class);
        userManager = new UserManager(mockCollection);
    }

    @Test
    public void testGetUserByIndexSuccess() throws UserManagerException, IOException {
        User user = new User("", "default");
        when(mockCollection.get(0)).thenReturn(user);
        assertEquals("Wrong user returned!", user, userManager.getUserByIndex(0));
    }

    @Test(expected = UserManagerException.class)
    public void testGetUserByIndexFail() throws UserManagerException, IOException {
        doThrow(IOException.class).when(mockCollection).get(0);
        userManager.getUserByIndex(0);
    }

    @Test(expected = UserManagerException.class)
    public void testCreateDefaultFail() throws UserManagerException, IOException {
        doThrow(IOException.class).when(mockCollection).add(any(User.class));
        userManager.createDefault("test");

    }

    @Test
    public void testCreateDefaultSuccess() throws UserManagerException, IOException {
        doAnswer(new Answer() {
            public Object answer(InvocationOnMock invocationOnMock)
                    throws Throwable {
                User user = (User) invocationOnMock.getArguments()[0];
                assertEquals("wrong name", "test", user.getName());
                assertEquals("wrong role", "default", user.getRole());
                return null;
            }
        }).when(mockCollection).add(any(User.class));
        userManager.createDefault("test");
        verify(mockCollection, times(1)).add(any(User.class));

    }
}
