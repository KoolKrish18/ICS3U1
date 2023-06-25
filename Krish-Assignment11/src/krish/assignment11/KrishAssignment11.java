/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krish.assignment11;

import java.util.Scanner;

/**
 *
 * @author nalam
 */
public class KrishAssignment11 {
    
    static void end(){ //method that prints end message
        System.out.println("\n\nTHE END. \nThank you for playing my game!!"); //end message
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyedInput = new Scanner (System.in); //initializes Scanner

        String ans; //initializes string ans for input variable 


        System.out.println("Welcome to the 'Choose your Adventure Game' - The Krish Edition 2023! \nType in Y/N representing yes and no for your answers to each question that is asked in order to play the game");
        //welcome message output

        System.out.println("\nYou live in a world with superheros and villians. Everyone gets their chance to pick their power. This is now your chance:"); //Explains Plot
        System.out.println("\nDo you want the power of fire? (Y/N)"); //Decision 1 Ques
        ans = keyedInput.next(); //gets input from the user
   
        
        if (ans.equalsIgnoreCase("y")){ //Decision 1 Ans Y - fire
            System.out.println("You now have have the ability to produce, control and use fire to your liking.\nYou are being teleported to the training center... \n\nYou arrive at the training center.\n");
            System.out.println("You enter the training center. Do you chose to start practicing your new fire ability? (Y/N)"); //Decision 2 Ques
            ans = keyedInput.next(); //gets input from the user
       
            
            if (ans.equalsIgnoreCase("y")){ //Decision 2 Ans Y - practice 
                System.out.println("You decide to look around for a good spot to test your ability. You look to your right and see training gear placed on the floor.");
                System.out.println("Do you pick up the gear and wear it for your safety? (Y/N)"); //Decision 4 Ques
                ans = keyedInput.next(); //gets input from the user
           
                
                if (ans.equalsIgnoreCase("y")){ //Decision 4 Ans Y - gear
                    System.out.println("While wearing your gear, a man, of your age, with bright blue eyes walks up to you. He introduces himself as Kevin and he explains that his ability is to control, use and change the state of water.");
                    System.out.println("He asks you to spar with him as it would be the perfect match of fire and water. Do you accept? (Y/N)"); //Decision 8 Ques    
                    ans = keyedInput.next(); //gets input from the user
               
                    
                    if (ans.equalsIgnoreCase("y")){ //Decision 8 Ans Y - spar
                        System.out.println("You fight with Kevin and find him to be a worthy opponent. There are usually 5 rounds to every sparring match and you lose the first 2 due to the fact that Kevin has a lot more experience. \nBut you soon figure out how to use your powers and beat Kevin the next 3 times.");
                        System.out.println("After defeating Kevin, he reveals that his was the number 1. hero globally. Becuase you beat him in the fight, you are now eligible for that role. \nDo you accept the role of being the world's best hero? (Y/N)"); //Decision
                        //Decision 16 Ques
                        ans = keyedInput.next(); //gets input from the user
                   
                        
                        if (ans.equalsIgnoreCase("y")){ //Decision 16 Ans Y - hero role
                            System.out.println("After accepting the role, you realize that although this role gives you money and popularity, it is also a lot of stress in your life. \nDue to this stress your aren't able to keep up a high performance and soon end up failling at the role. \nYou start to spiral out of control and decide that suicide is your only way out.");
                            end(); //calls method to end program
                        }
                        
                        
                        else if (ans.equalsIgnoreCase("n")){ //Decision 16 Ans N - hero role
                            System.out.println("After beating Kevin you realize that your a pretty powerful hero. But you don't want to stress yourself and end up doing a mediocre job, purely to make a living. \nYou end up leading a peaceful life from now on.");
                            end(); //calls method to end program
                        }
                    }
                    
                    
                    else if (ans.equalsIgnoreCase("n")){ //Decision 8 Ans N - spar
                        System.out.println("You say that your new to the training center and don't want to fight. \nThis enrages Kevin as he doesn't take no for an answer and starts attacking you anyways. He ends up killing you.");
                        end(); //calls method to end program
                    }
                }
                
                
                else if (ans.equalsIgnoreCase("n")){ //Decision 4 Ans N - gear
                    System.out.println("You continue to walk around and find a hero obstacle course.");
                    System.out.println("Do you participate in this course? (Y/N)"); //Decision 9 Ques
                    ans = keyedInput.next(); //gets input from the user
               
                    
                    if (ans.equalsIgnoreCase("y")){ //Decision 9 Ans Y - course
                        System.out.println("During your run on the obstacle course, another trainee sees you and pushes you off to get ahead of you. \nBut becuase you have the power of fire you use it to fly back up.");
                        System.out.println("You see the trainee who pushed you off. Do you push them back? (Y/N)"); //Decision 17 Ques
                        ans = keyedInput.next(); //gets input from the user
                   
                        
                        if (ans.equalsIgnoreCase("y")){ //Decision 17 Ans Y - push
                            System.out.println("You push the trainee and end up using too much force. They are now permenantly injured and you get banned from the training center.");
                            System.out.println("Out of revenge, you use your powers to burn the center down to ashes killing everyone in it. \nYou find doings crimes is very fun and so you lead a life of villainy from now on.");
                            System.out.println("You encounter Kevin, the worlds best hero, and defeat him in a fight. \nDo you kill him? (Y/N)"); //Decision 20 Ques 
                            ans = keyedInput.next(); //gets input from the user
                            
                            
                            if (ans.equalsIgnoreCase("y")){ //Decision 20 Ans Y - Kill
                                System.out.println("You have killed Kevin and instilled fear in all heroes and citizens of the planet. \nYou take over the world.");
                                end(); //calls method to end program
                            }
                            
                            
                            else if (ans.equalsIgnoreCase("n")){ //Decision 20 Ans N - Kill
                                System.out.println("You are killed by the same hero you spared and realize in your dying breathe that the world is unfair.");
                                end(); //calls method to end program
                            }
                                                        
                        }
                        
                        
                        else if (ans.equalsIgnoreCase("n")){ //Decision 17 Ans N - push
                            System.out.println("The coaches notice your amazing recovery skills and praise you for your abilities. \nThey proceed to give you a hero's lisence and from there you become a high ranking hero, protecting society with your skills.");
                            end(); //calls method to end program
                        }
                    }
                    
                    
                    else if (ans.equalsIgnoreCase("n")){ //Decision 9 Ans N - course
                        System.out.println("You decide that the training center is not for you and leave out of boredom.");
                        System.out.println("Do you train by yourself? (Y/N)"); //Decision 18 Ques
                        ans = keyedInput.next(); //gets input from the user
                   
                        
                        if (ans.equalsIgnoreCase("y")){ //Decision 18 Ans Y - train
                            System.out.println("You train very hard and keep pushing your self to be better. \nBut one day you challenge yourself too much and without proper equipment end up breaking your spine. \nYou are now paralyzed forever.");
                            end(); //calls method to end program
                        }
                        
                        
                        else if (ans.equalsIgnoreCase("n")){ //Decision 18 Ans N - train
                            System.out.println("You never practice with your power, but decide to show it off to your friends. \nAfter using your power it backfires and you end up in the hospital with third degree burns.");
                            end(); //calls method to end program
                        }
                    }
                }
            }
            
            
            else if (ans.equalsIgnoreCase("n")){ //Decision 2 Ans N - practice
                System.out.println("You do some research about the world of hero's instead and find out that there is a hero lisence test you must pass to use your powers.");
                System.out.println("Do you register to take the test? (Y/N)"); //Decision 5 Ques
                ans = keyedInput.next(); //gets input from the user
           
                
                if (ans.equalsIgnoreCase("y")){ //Decision 5 Ans Y - test
                    System.out.println("The physical portion of the test proves itself to be very difficult. \nBut somehow you obtain a sample of an illegal power amplyfing drug.");
                    System.out.println("Do you take the drug? (Y/N)"); //Decision 10 Ques
                    ans = keyedInput.next(); //gets input from the user
               
                    
                    if (ans.equalsIgnoreCase("y")){ //Decision 10 Ans Y - Drug
                        System.out.println("You barely manage to pass the test even with your amplified powers. \nAfter recieving your lisence you immediately pass out and die from over exhaustion and other side affects of the drug");
                        end(); //calls method to end program
                    }
                    
                    
                    else if (ans.equalsIgnoreCase("n")){ //Decision 10 Ans N - Drug
                        System.out.println("You don't take the drugs and fail the test. \nYou cannot retry the test for the next 3 years");
                        System.out.println("Do you try to destroy the training center for revenge? (Y/N)"); //Decision 19 Ques
                        ans = keyedInput.next(); //gets input from the user
                   
                        
                        if (ans.equalsIgnoreCase("y")){ //Decision 19 Ans Y - revenge
                            System.out.println("You successfully destroy the training center but now you deeply regret your actions.  \nYou run away from the scene of the crime and spend the rest of your life as a fugative hiding from the police.");
                            end(); //calls method to end program
                        }
                        
                        
                        else if (ans.equalsIgnoreCase("n")){ //Decision 19 Ans N - revenge
                            System.out.println("You are dejected from the results of the exam and decide that the hero life isn't for you. \nThis is when you realise that you would be a much better computer science teacher and since, you pursue that career path instead.");
                            end(); //calls method to end program
                        }
                    }    
                }
                
                
                else if (ans.equalsIgnoreCase("n")){ //Decision 5 Ans N - test
                    System.out.println("From your research you also learn that it is illegal to use your powers without a lisence.");
                    System.out.println("Do you use your powers without a lisence anyways? (Y/N)"); //Decision 11 Ques
                    ans = keyedInput.next(); //gets input from the user
               
                    
                    if (ans.equalsIgnoreCase("y")){ //Decision 11 Ans Y - anyways
                        System.out.println("You get caught by the police for using your powers illegally. \nYou are sentenced to jail for a lifetime due to endangerment of civillians");
                        end(); //calls method to end program
                    }
                    
                    
                    else if (ans.equalsIgnoreCase("n")){ //Decision 11 Ans N - anyways
                        System.out.println("You train and work hard preparing yourself to eventually take the test. \n3 years pass by and you think that you are finally ready to pass the test.");
                        System.out.println("You are taking the test. \nDo you try to cheat on the test? (Y/N)"); //Decision 21 Ques
                        ans = keyedInput.next(); //gets input from the user
                   
                        
                        if (ans.equalsIgnoreCase("y")){ //Decision 21 Ans Y - cheat
                            System.out.println("You cheat and pass the test. \nBut you feel guilty and choose to never use the lisence ever in your life.");
                            end(); //calls method to end program
                        }
                        
                        
                        else if (ans.equalsIgnoreCase("n")){ //Decision 21 Ans N - cheat
                            System.out.println("The test was extremely hard and you failed. \nYou are mad that you lost 3 years of your life training just to fail. \nYou become a monk to understand why and try to learn the meaning of life.");
                            end(); //calls method to end program
                        }
                    }
                }
            }
        }
        
            
        else if (ans.equalsIgnoreCase("n")){ //Decision 1 Ans N - fire 
            System.out.println("You are a civillian. \nYou need Groceries");
            System.out.println("Do you go to the supermarket? (Y/N)"); //Decision 3 Ques
            ans = keyedInput.next(); //gets input from the user
       
            
            if (ans.equalsIgnoreCase("y")){ //Decision 3 Ans Y - market
                System.out.println("You are at the store and a villian attacks.");
                System.out.println("Do you hide? (Y/N)"); //Decision 6 Ques
                ans = keyedInput.next(); //gets input from the user
           
                
                if (ans.equalsIgnoreCase("y")){ //Decision 6 Ans Y - hide
                    System.out.println("The villain finds an elderly couple and is going to kill them.");
                    System.out.println("Do you try to save them? (Y/N)"); //Decision 12 Ques
                    ans = keyedInput.next(); //gets input from the user
               
                    
                    if (ans.equalsIgnoreCase("y")){ //Decision 12 Ans Y - save
                        System.out.println("You somehow distract the villain long enough for the elderly couple to run and escape out of the situation. \nBut in the proccess you get caught and the villain is about to kill you.");
                        System.out.println("Do you use your last words to curse the villain out? (Y/N)"); //Decision 22 Ques
                        ans = keyedInput.next(); //gets input from the user
                   
                        
                        if (ans.equalsIgnoreCase("y")){ //Decision 22 Ans Y - curse
                            System.out.println("You somehow manage to stall long enough for the heros to arrive and you are saved! \nThe old couple thanks you later aswell and you are regarded as a brave civillian.");
                            end(); //calls method to end program
                        }
                        
                        
                        else if (ans.equalsIgnoreCase("n")){ //Decision 22 Ans N - curse
                            System.out.println("You beg for mercy but the villain doesn't have any feelings and kills you.");
                            end(); //calls method to end program
                        }
                    }
                    
                    
                    else if (ans.equalsIgnoreCase("n")){ //Decision 12 Ans N - save
                        System.out.println("The villain kills the elderly couple while you are watching from your hiding spot.");
                        System.out.println("Do you run away? (Y/N)"); //Decision 23 Ques
                        ans = keyedInput.next(); //gets input from the user
                   
                        
                        if (ans.equalsIgnoreCase("y")){ //Decision 23 Ans Y - run
                            System.out.println("You make it safely out of the situation and go home to finally eat the food you bought happily knowing you lived.");
                            end(); //calls method to end program
                        }
                        
                        
                        else if (ans.equalsIgnoreCase("n")){ //Decision 23 Ans N - run
                            System.out.println("You want to get revenge for the old couple and charge straight in to kill the villain.");
                            System.out.println("Do you try to punch him? (Y/N)"); //Decision 27 Ques
                            ans = keyedInput.next(); //gets input from the user
                       
                            
                            if (ans.equals("y")){ //Decision 27 Ans Y - punch
                                System.out.println("You punch the villain and break your arm. \nThe villain spares you out of pity but rips off your arm.");
                                end(); //calls method to end program
                            }
                            
                            
                            else if (ans.equalsIgnoreCase("n")){ //Decision 27 Ans N - punch
                                System.out.println("You throw potatoes at the villain to distract him while running to grab a knife you see. \nYou have now accquired a knife.");
                                System.out.println("Do you throw the knife at the villain? (Y/N)"); //Decision 29 Ques 
                                ans = keyedInput.next(); //gets input from the user
                           
                                
                                if (ans.equalsIgnoreCase("y")){ //Decision 29 Ans Y - throw
                                    System.out.println("The villain dodges the knife and the knife hits an innocent person. \nAs the villain runs away the innocent person dies from being impaled and your are now framed for the villains crimes. \nYou spend the rest of your life in jail.");
                                    end(); //calls method to end program
                                }
                                
                                
                                else if (ans.equalsIgnoreCase("n")){ //Decision 29 Ans N - throw
                                    System.out.println("You try to stab the villain but you fail. The villain than pinches you. \nYou wake up and realize that everything you went through was actually a dream.");
                                    System.out.println("Do you go back to sleep? (Y/N)"); //Decision 30 Ques
                                    ans = keyedInput.next(); //gets input from the user
                               
                                    
                                    if (ans.equalsIgnoreCase("y")){ //Decision 30 Ans Y - sleep
                                        System.out.println("You enjoy sleeping for the rest of the day.");
                                        end(); //calls method to end program
                                    }
                                    
                                    
                                    else if (ans.equalsIgnoreCase("n")){ //Decision 30 Ans N - sleep
                                        System.out.println("You don't go back to sleep because you realize that you now have an idea to use your dream for your computer science assignment.");
                                        end(); //calls method to end program
                                    }
                                }
                            }
                        }
                    }
                }
                                
                else if (ans.equalsIgnoreCase("n")){ //Decision 6 Ans N - hide
                    System.out.println("There is a metal shovel on the ground.");
                    System.out.println("Do you pick it up to fight? (Y/N)"); //Decision 13 Ques
                    ans = keyedInput.next(); //gets input from the user
               
                    
                    if (ans.equalsIgnoreCase("y")){ //Decision 13 Ans Y - shovel
                        System.out.println("You smack the villain with the shovel knocking him out and save everyone! \nYou are regarded as a great hero.");
                        end(); //calls method to end program
                    }
                    
                    
                    else if (ans.equalsIgnoreCase("n")){ //Decision 13 Ans N - shovel
                        System.out.println("You proceed to hide but the villain finds you and kidnaps you.");
                        System.out.println("Do you get Stockholm Syndrome? (Y/N)"); //Decision 28 Ques
                        ans = keyedInput.next(); //gets input from the user
                   
                        
                        if (ans.equalsIgnoreCase("y")){ //Decision 28 Ans Y - syndrome
                            System.out.println("The villain falls in love with you too and you live happily ever after.");
                            end(); //calls method to end program
                        }
                        
                        
                        else if (ans.equalsIgnoreCase("n")){ //Decision 28 Ans N - syndrome
                            System.out.println("The villain asks your parents for ransom money but they say you are worthless. \nRealizing they are correct the villain lets you go as you hold no monetary value to them.");
                            end(); //calls method to end program
                        }
                    }
                }                    
            }
            
            
            
            else if (ans.equalsIgnoreCase("n")){ //Decision 3 Ans N - market
                System.out.println("You are very hungry.");
                System.out.println("Do you order food to your house? (Y/N)"); //Decision 7 Ques
                ans = keyedInput.next(); //gets input from the user


                if (ans.equalsIgnoreCase("y")){ //Decision 7 Ans Y - order
                    System.out.println("Your food arrives. The delivery person is very pretty.");
                    System.out.println("Do you flirt with them? (Y/N)"); //Decision 14 Ques
                    ans = keyedInput.next(); //gets input from the user


                    if (ans.equalsIgnoreCase("y")){ //Decision 14 Ans Y - flirt
                        System.out.println("The file a harrasment case on you and you go to court.");
                        System.out.println("Do you plead guilty? (Y/N)"); //Decision 24 Ques
                        ans = keyedInput.next(); //gets input from the user


                        if (ans.equalsIgnoreCase("y")){ //Decision 24 Ans Y - guilty
                            System.out.println("You plead guilty and the judge lets you go only having to do 40 hours of community service.");
                            end(); //calls method to end program
                        }


                        else if (ans.equalsIgnoreCase("n")){ //Decision 24 Ans N - guilty
                            System.out.println("You choose to not plead guilty but you are rendered a liar. \nYou are sentenced to 25 years of jail time.");
                            end(); //calls method to end program
                        }
                    }


                    else if (ans.equalsIgnoreCase("n")){ //Decision 14 Ans N - flirt
                        System.out.println("They start flirting with you and try to make conversation. /They say that their shift is over.");
                        System.out.println("Do you let them into your house? (Y/N)"); //Decision 25 Ques
                        ans = keyedInput.next(); //gets input from the user


                        if (ans.equalsIgnoreCase("y")){ //Decision 25 Ans Y - house
                            System.out.println("They turn out to be a serial killer and murder you.");
                            end(); //calls method to end program
                        }


                        else if (ans.equalsIgnoreCase("n")){ //Decision 25 Ans N - house
                            System.out.println("You don't let them into your house and 2 weeks later you see them on the news. \nThey are a serial killer and you are glad you never let them into your house.");
                            end(); //calls method to end program
                        }
                    }
                }


                else if (ans.equalsIgnoreCase("n")){ //Decision 7 Ans N - order
                    System.out.println("You are starving.");
                    System.out.println("Do you ask your mom to cook you some food? (Y/N)"); //Decision 15 Ques
                    ans = keyedInput.next(); //gets input from the user


                    if (ans.equalsIgnoreCase("y")){ //Decision 15 Ans Y - cook
                        System.out.println("Your mom refuses and tells you to cook for yourself with whatever ingredients you have at home.");
                        System.out.println("Do you try to cook? (Y/N)"); //Decision 26 Ques
                        ans = keyedInput.next(); //gets input from the user


                        if (ans.equalsIgnoreCase("y")){ //Decision 26 Ans Y - own
                            System.out.println("You end up burning your house down and are now homeless.");
                            end(); //calls method to end program
                        }


                        else if (ans.equalsIgnoreCase("n")){ //Decision 26 Ans N - own
                            System.out.println("You starve to death.");
                            end(); //calls method to end program
                        }    
                    }


                    else if (ans.equalsIgnoreCase("n")){ //Decision 15 Ans N - cook
                        System.out.println("You starve to death.");
                        end(); //calls method to end program
                    }

                }                
            }
        }        
    }  
}
