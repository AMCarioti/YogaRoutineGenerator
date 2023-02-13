import java.util.*;

class MoveGenerator {
  private ArrayList<Warmup> warmupMoves;
  private ArrayList<Stretch> stretchMoves;
  private ArrayList<Strengthen> strengthMoves;
  private ArrayList<Cooldown> cooldownMoves;

  public MoveGenerator(){

    //Warmup Moves:
    warmupMoves = new ArrayList<Warmup>();
    warmupMoves.add(new Warmup("Standing Mountain pose (Tadasana) - Standing tall with your feet together, hands by your side, and your gaze forward"));
    warmupMoves.add(new Warmup("Cat-Cow Stretch - Begin on all fours with your wrists under your shoulders and your knees under your hips. Arch your back and tuck your chin to your chest as you exhale, then drop your belly towards the floor and lift your head and tailbone towards the ceiling as you inhale"));
    warmupMoves.add(new Warmup("Shoulder Rolls - Stand with your feet hip-width apart, roll your shoulders forward and back, then in a circle"));
    warmupMoves.add(new Warmup("Neck Rolls - Sit or stand tall, then tilt your right ear towards your right shoulder and roll your head down towards your chest, then back and up to the left ear towards your left shoulder"));
    warmupMoves.add(new Warmup("Arm Circles - Stand with your feet hip-width apart and make large circles with your arms, first forwards and then backwards."));
    warmupMoves.add(new Warmup("Ankle Rotations - Sit on the edge of a chair or on the floor with your legs extended in front of you. Rotate your ankles in a circle, first clockwise and then counterclockwise."));
    warmupMoves.add(new Warmup("Torso Twists - Stand with your feet hip-width apart, then twist your torso to the left and hold for several breaths before twisting to the right."));
    warmupMoves.add(new Warmup("Knee-to-Chest Stretch - Lie on your back with your knees bent and your feet flat on the floor. Bring one knee towards your chest and hold onto the back of your thigh with both hands."));
    warmupMoves.add(new Warmup("Forward Bend - Stand with your feet hip-width apart and hinge forward at the hips, keeping your knees slightly bent."));
    warmupMoves.add(new Warmup("Downward-Facing Dog - Start on all fours with your wrists under your shoulders and your knees under your hips. Lift your hips up and back, straightening your arms and legs to form an inverted V shape."));

    // Stretch Moves:
    stretchMoves = new ArrayList<Stretch>();
    stretchMoves.add(new Stretch("Pigeon Pose - Begin on all fours, bring your right knee forward to your right hand and extend your left leg behind you. Lower your hips towards the floor, keeping your right ankle underneath your right knee."));
    stretchMoves.add(new Stretch("Child's Pose (Balasana) - Start on all fours, then sit back on your heels and reach your arms forward to stretch the spine."));
    stretchMoves.add(new Stretch("Camel Pose (Ustrasana) - Start on your knees and place your hands on your lower back, then lift your chest and head up towards the ceiling."));
    stretchMoves.add(new Stretch("Lizard Pose (Utthan Pristhasana) - Start in a lunge position with your left foot forward, lower your left knee to the floor and bring your left foot outside of your left hand."));
    stretchMoves.add(new Stretch("Butterfly Pose (Baddha Konasana) - Sit with the soles of your feet together and bring your heels close to your body, then gently press your knees down towards the floor."));
    stretchMoves.add(new Stretch("Seated spinal twist (Ardha matsyendrasana) - Sit on the floor with your legs extended in front of you, bend your right knee and bring your right foot to the outside of your left thigh. Twist your torso to the right and place your left elbow on the outside of your right knee."));
    stretchMoves.add(new Stretch("Half Camel (Ardha Ustrasana) - Start in a kneeling position and place your hands on your lower back, then slowly lift your chest and head up towards the ceiling."));
    stretchMoves.add(new Stretch("Extended Triangle Pose (Utthita Trikonasana) - Stand with your feet wide apart, extend your right arm and reach it over your right leg, then lean your torso towards your right leg."));
    stretchMoves.add(new Stretch("Half pigeon pose (Ardha Kapotasana) - Begin on all fours and bring your right knee forward to your right hand and extend your left leg behind you. Keep your right ankle under your right knee and lower your hips towards the floor."));
    stretchMoves.add(new Stretch("Lizard lunge (Utthan Pristhasana lunge variation) - Start in a lunge position with your left foot forward, bring your left knee down to the floor and bring your left foot outside of your left hand, then extend your arms forward on the floor."));

    // Strength Moves:
    strengthMoves = new ArrayList<Strengthen>();
    strengthMoves.add(new Strengthen("Plank Pose - Start on all fours and extend your arms to straighten your body into a plank position."));
    strengthMoves.add(new Strengthen("Chaturanga Dandasana - Start in a plank position then lower your body towards the floor, keeping your elbows close to your body."));
    strengthMoves.add(new Strengthen("Upward-Facing Dog - Start lying on your stomach with your hands next to your shoulders, press up into an upward facing dog position."));
    strengthMoves.add(new Strengthen("Warrior I (Virabhadrasana I) - Step your left foot back and bend your right knee to a 90-degree angle, extending your arms overhead."));
    strengthMoves.add(new Strengthen("Warrior II (Virabhadrasana II) - Step your left foot back and bend your right knee to a 90-degree angle, extend your arms out to the sides of your body."));
    strengthMoves.add(new Strengthen("Triangle Pose (Trikonasana) - Stand with your feet wide apart, extend your right arm and reach it over your right leg, then lean your torso towards your right leg and place your left hand on your left ankle or on the floor."));
    strengthMoves.add(new Strengthen("Chair Pose (Utkatasana) - Stand with your feet hip-width apart, bend your knees and lower your hips as if sitting back into a chair. Bring your arms up overhead."));
    strengthMoves.add(new Strengthen("Tree Pose (Vrikshasana) - Stand tall and bring your right foot up to rest on your left thigh, press your hands together in front of your chest."));
    strengthMoves.add(new Strengthen("Cobra Pose (Bhujangasana) - Lying on your stomach with your hands next to your shoulders, press into your hands to lift your chest and head off the ground."));
    strengthMoves.add(new Strengthen("Side Plank (Vasisthasana) - Start in a plank position, rotate your body to the side and raise one arm towards the ceiling, stacking your feet on top of each other."));

    // Cooldown Moves:
    cooldownMoves = new ArrayList<Cooldown>();
    cooldownMoves.add(new Cooldown("Child's Pose (Balasana) - Start on all fours, then sit back on your heels and reach your arms forward to stretch the spine."));
    cooldownMoves.add(new Cooldown("Seated Forward Bend (Paschimottanasana) - Sit with your legs extended in front of you, bend forward at the hips and reach for your toes."));
    cooldownMoves.add(new Cooldown("Corpse Pose (Savasana) - Lie on your back with your arms by your side and your legs slightly apart, completely relax your body."));
    cooldownMoves.add(new Cooldown("Happy Baby Pose (Ananda Balasana) - Lie on your back and bring your knees towards your chest, grab the outsides of your feet with your hands."));
    cooldownMoves.add(new Cooldown("Shoulder Stand (Sarvangasana) - Lie on your back and raise your legs and hips towards the ceiling, supporting your lower back with your hands."));
    cooldownMoves.add(new Cooldown("Fish Pose (Matsyasana) - Lie on your back with your hands under your hips, press your forearms and elbows into the floor and lift your head and shoulders off the ground."));
    cooldownMoves.add(new Cooldown("Legs Up the Wall Pose (Viparita Karani) - Sit with one hip against a wall, then lie back and raise your legs up against the wall."));
    cooldownMoves.add(new Cooldown("Head-to-Knee Forward Bend (Janu Sirsasana) - Sit with your legs extended in front of you, bend your right knee and bring the sole of your right foot to the inside of your left thigh, then reach forward to your left foot."));
    cooldownMoves.add(new Cooldown("Bound Angle Pose (Baddha Konasana) - Sit with the soles of your feet together and bring your heels close to your body, then gently press your knees down towards the floor."));
    cooldownMoves.add(new Cooldown("Reclining Hand-to-Big-Toe Pose (Supta Padangusthasana) - Lie on your back and bring one knee towards your chest, then extend that leg up towards the ceiling while holding onto the big toe with your hand."));
  }
  
  public ArrayList<YogaMove> generate(int totalTime) {
    ArrayList<YogaMove> moveSet = new ArrayList<YogaMove>();
    int warmupMovesTime = (int)(totalTime * 0.2);
    int stretchMovesTime = (int)(totalTime * 0.3);
    int strengthMovesTime = (int)(totalTime * 0.3);
    int cooldownMovesTime = (int)(totalTime * 0.2);

    int warmupMovesCount = (int)(warmupMovesTime / Warmup.duration);
    int stretchMovesCount = (int)(stretchMovesTime / Stretch.duration);
    int strengthMovesCount = (int)(strengthMovesTime / Strengthen.duration);
    int cooldownMovesCount = (int)(cooldownMovesTime / Cooldown.duration);
    
    moveSet.addAll(getRandomMoves(warmupMoves, warmupMovesCount));
    moveSet.addAll(getRandomMoves(stretchMoves, stretchMovesCount));
    moveSet.addAll(getRandomMoves(strengthMoves, strengthMovesCount));
    moveSet.addAll(getRandomMoves(cooldownMoves, cooldownMovesCount));
    
    return moveSet;
  }

  private ArrayList<YogaMove> getRandomMoves(ArrayList<? extends YogaMove> moves, int count){
    ArrayList<YogaMove> randomMoves = new ArrayList<YogaMove>();
    Random rand = new Random();
    for (int i = 0; i < count; i++){
      int randomIndex = rand.nextInt(moves.size());
      randomMoves.add(moves.get(randomIndex));
    }
  return randomMoves;
  }
}
